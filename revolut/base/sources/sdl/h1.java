package sdl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class h1 implements rlm.g {
    public h1() {
        Intrinsics.checkNotNullParameter("code", "discriminator");
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return rlm.g.class;
    }

    @Override // rlm.g
    public final /* synthetic */ String discriminator() {
        return "code";
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj2) {
        return (obj2 instanceof rlm.g) && "code".equals(((rlm.g) obj2).discriminator());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 706652809;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=code)";
    }
}
