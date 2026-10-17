package ft3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class v implements rlm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f137881a;

    public v(String discriminator) {
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        this.f137881a = discriminator;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return rlm.g.class;
    }

    @Override // rlm.g
    public final /* synthetic */ String discriminator() {
        return this.f137881a;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj2) {
        return (obj2 instanceof rlm.g) && this.f137881a.equals(((rlm.g) obj2).discriminator());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return this.f137881a.hashCode() ^ 707790692;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return p.a.p("@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=", this.f137881a, ")");
    }
}
