package zg3;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class l implements rlm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322065a;

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        switch (this.f322065a) {
        }
        return rlm.g.class;
    }

    @Override // rlm.g
    public final /* synthetic */ String discriminator() {
        switch (this.f322065a) {
        }
        return "type";
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj2) {
        switch (this.f322065a) {
            case 0:
                if ((obj2 instanceof rlm.g) && "type".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            default:
                if ((obj2 instanceof rlm.g) && "type".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
        }
        return true;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        switch (this.f322065a) {
        }
        return 705071198;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        switch (this.f322065a) {
        }
        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=type)";
    }
}
