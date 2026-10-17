package krk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class n implements rlm.g {
    public n() {
        Intrinsics.checkNotNullParameter("valueType", "discriminator");
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return rlm.g.class;
    }

    @Override // rlm.g
    public final /* synthetic */ String discriminator() {
        return "valueType";
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj2) {
        return (obj2 instanceof rlm.g) && "valueType".equals(((rlm.g) obj2).discriminator());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return -127110353;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=valueType)";
    }
}
