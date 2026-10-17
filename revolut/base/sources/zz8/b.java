package zz8;

import kotlin.jvm.internal.Intrinsics;
import rlm.g;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements g {
    public b() {
        Intrinsics.checkNotNullParameter("rewardType", "discriminator");
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return g.class;
    }

    @Override // rlm.g
    public final /* synthetic */ String discriminator() {
        return "rewardType";
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj2) {
        return (obj2 instanceof g) && "rewardType".equals(((g) obj2).discriminator());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 1325278317;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=rewardType)";
    }
}
