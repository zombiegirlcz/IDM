package com.github.devnied.emvnfccard.parser.apdu.annotation;

import com.github.devnied.emvnfccard.iso7816emv.ITag;
import com.github.devnied.emvnfccard.model.CPLC;
import com.github.devnied.emvnfccard.model.EmvTransactionRecord;
import com.github.devnied.emvnfccard.parser.apdu.IFile;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes16.dex */
public final class AnnotationUtils {
    private final Map<String, Map<ITag, AnnotationData>> map = new HashMap();
    private final Map<String, Set<AnnotationData>> mapSet = new HashMap();
    private static final Class<? extends IFile>[] LISTE_CLASS = {EmvTransactionRecord.class, CPLC.class};
    private static final AnnotationUtils INSTANCE = new AnnotationUtils();

    private AnnotationUtils() {
        extractAnnotation();
    }

    private void extractAnnotation() {
        for (Class<? extends IFile> cls : LISTE_CLASS) {
            HashMap map = new HashMap();
            TreeSet treeSet = new TreeSet();
            for (Field field : cls.getDeclaredFields()) {
                AnnotationData annotationData = new AnnotationData();
                field.setAccessible(true);
                annotationData.setField(field);
                Data data = (Data) field.getAnnotation(Data.class);
                if (data != null) {
                    annotationData.initFromAnnotation(data);
                    map.put(annotationData.getTag(), annotationData);
                    try {
                        treeSet.add((AnnotationData) annotationData.clone());
                    } catch (CloneNotSupportedException unused) {
                    }
                }
            }
            this.mapSet.put(cls.getName(), treeSet);
            this.map.put(cls.getName(), map);
        }
    }

    public static AnnotationUtils getInstance() {
        return INSTANCE;
    }

    public Map<String, Map<ITag, AnnotationData>> getMap() {
        return this.map;
    }

    public Map<String, Set<AnnotationData>> getMapSet() {
        return this.mapSet;
    }
}
