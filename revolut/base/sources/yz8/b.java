package yz8;

import kotlin.jvm.internal.Intrinsics;
import rlm.g;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements g {
    public b() {
        Intrinsics.checkNotNullParameter("type", "discriminator");
    }

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
