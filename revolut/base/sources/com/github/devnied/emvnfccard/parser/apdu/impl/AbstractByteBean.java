package com.github.devnied.emvnfccard.parser.apdu.impl;

import com.github.devnied.emvnfccard.iso7816emv.ITag;
import com.github.devnied.emvnfccard.iso7816emv.TagAndLength;
import com.github.devnied.emvnfccard.model.AbstractData;
import com.github.devnied.emvnfccard.parser.apdu.IFile;
import com.github.devnied.emvnfccard.parser.apdu.annotation.AnnotationData;
import com.github.devnied.emvnfccard.parser.apdu.annotation.AnnotationUtils;
import fr.devnied.bitlib.BitUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractByteBean<T> extends AbstractData implements IFile {
    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractByteBean.class.getName());
    private static final long serialVersionUID = -2016039522844322383L;

    private Collection<AnnotationData> getAnnotationSet(Collection<TagAndLength> collection) {
        if (collection == null) {
            return AnnotationUtils.getInstance().getMapSet().get(getClass().getName());
        }
        Map<ITag, AnnotationData> map = AnnotationUtils.getInstance().getMap().get(getClass().getName());
        ArrayList arrayList = new ArrayList(map.size());
        for (TagAndLength tagAndLength : collection) {
            AnnotationData annotationData = map.get(tagAndLength.getTag());
            if (annotationData != null) {
                annotationData.setSize(tagAndLength.getLength() * 8);
            } else {
                annotationData = new AnnotationData();
                annotationData.setSkip(true);
                annotationData.setSize(tagAndLength.getLength() * 8);
            }
            arrayList.add(annotationData);
        }
        return arrayList;
    }

    @Override // com.github.devnied.emvnfccard.parser.apdu.IFile
    public void parse(byte[] bArr, Collection<TagAndLength> collection) {
        Collection<AnnotationData> annotationSet = getAnnotationSet(collection);
        BitUtils bitUtils = new BitUtils(bArr);
        for (AnnotationData annotationData : annotationSet) {
            if (annotationData.isSkip()) {
                bitUtils.addCurrentBitIndex(annotationData.getSize());
            } else {
                setField(annotationData.getField(), this, DataFactory.getObject(annotationData, bitUtils));
            }
        }
    }

    public void setField(Field field, IFile iFile, Object obj2) {
        if (field != null) {
            try {
                field.set(iFile, obj2);
            } catch (IllegalAccessException e) {
                LOGGER.error("Impossible to set the Field :" + field.getName(), (Throwable) e);
            } catch (IllegalArgumentException e2) {
                LOGGER.error("Parameters of fied.set are not valid", (Throwable) e2);
            }
        }
    }
}
