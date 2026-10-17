package if7;

import rlm.g;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class d implements g {
    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return g.class;
    }

    @Override // rlm.g
    public final /* synthetic */ String discriminator() {
        return "type";
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj2) {
        return (obj2 instanceof g) && "type".equals(((g) obj2).discriminator());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 705071198;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=type)";
    }
}
