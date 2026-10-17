package com.github.devnied.emvnfccard.parser.apdu.annotation;

import com.github.devnied.emvnfccard.iso7816emv.EmvTags;
import com.github.devnied.emvnfccard.iso7816emv.ITag;
import fr.devnied.bitlib.BytesUtils;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes16.dex */
public class AnnotationData implements Comparable<AnnotationData>, Cloneable {
    private int dateStandard;
    private Field field;
    private String format;
    private int index;
    private boolean readHexa;
    private int size;
    private boolean skip;

    /* JADX INFO: renamed from: tag, reason: collision with root package name */
    private ITag f37250tag;

    public Object clone() throws CloneNotSupportedException {
        AnnotationData annotationData = new AnnotationData();
        annotationData.dateStandard = this.dateStandard;
        annotationData.field = this.field;
        annotationData.format = new String(this.format);
        annotationData.index = this.index;
        annotationData.readHexa = this.readHexa;
        annotationData.size = this.size;
        annotationData.f37250tag = this.f37250tag;
        return annotationData;
    }

    public boolean equals(Object obj2) {
        return (obj2 instanceof AnnotationData) && this.index == ((AnnotationData) obj2).getIndex();
    }

    public int getDateStandard() {
        return this.dateStandard;
    }

    public Field getField() {
        return this.field;
    }

    public String getFormat() {
        return this.format;
    }

    public int getIndex() {
        return this.index;
    }

    public int getSize() {
        return this.size;
    }

    public ITag getTag() {
        return this.f37250tag;
    }

    public void initFromAnnotation(Data data) {
        this.dateStandard = data.dateStandard();
        this.format = data.format();
        this.index = data.index();
        this.readHexa = data.readHexa();
        this.size = data.size();
        if (data.tag() != null) {
            this.f37250tag = EmvTags.find(BytesUtils.fromString(data.tag()));
        }
    }

    public boolean isReadHexa() {
        return this.readHexa;
    }

    public boolean isSkip() {
        return this.skip;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public void setSize(int i) {
        this.size = i;
    }

    public void setSkip(boolean z) {
        this.skip = z;
    }

    @Override // java.lang.Comparable
    public int compareTo(AnnotationData annotationData) {
        return Integer.valueOf(this.index).compareTo(Integer.valueOf(annotationData.getIndex()));
    }
}
