package hi9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g implements rlm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152546a;

    public g(int i) {
        this.f152546a = i;
        switch (i) {
            case 3:
                Intrinsics.checkNotNullParameter("serviceType", "discriminator");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
            case 19:
            case 24:
            default:
                Intrinsics.checkNotNullParameter("type", "discriminator");
                break;
            case 15:
                Intrinsics.checkNotNullParameter("type", "discriminator");
                break;
            case 16:
                Intrinsics.checkNotNullParameter("status", "discriminator");
                break;
            case 17:
                Intrinsics.checkNotNullParameter("contentType", "discriminator");
                break;
            case 20:
                Intrinsics.checkNotNullParameter("type", "discriminator");
                break;
            case 21:
                Intrinsics.checkNotNullParameter("type", "discriminator");
                break;
            case 22:
                Intrinsics.checkNotNullParameter("type", "discriminator");
                break;
            case 23:
                Intrinsics.checkNotNullParameter("type", "discriminator");
                break;
            case 25:
                Intrinsics.checkNotNullParameter("code", "discriminator");
                break;
            case 26:
                Intrinsics.checkNotNullParameter("type", "discriminator");
                break;
            case 27:
                Intrinsics.checkNotNullParameter("type", "discriminator");
                break;
            case 28:
                Intrinsics.checkNotNullParameter("type", "discriminator");
                break;
        }
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        switch (this.f152546a) {
        }
        return rlm.g.class;
    }

    @Override // rlm.g
    public final /* synthetic */ String discriminator() {
        switch (this.f152546a) {
        }
        return "type";
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj2) {
        switch (this.f152546a) {
            case 0:
                if ((obj2 instanceof rlm.g) && "type".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 1:
                if ((obj2 instanceof rlm.g) && "rejection_button_action".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 2:
                if ((obj2 instanceof rlm.g) && "type".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 3:
                if ((obj2 instanceof rlm.g) && "serviceType".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 4:
                if ((obj2 instanceof rlm.g) && "contentType".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 5:
                if ((obj2 instanceof rlm.g) && "contentType".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 6:
                if ((obj2 instanceof rlm.g) && "contentType".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 7:
                if ((obj2 instanceof rlm.g) && "contentType".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 8:
                if ((obj2 instanceof rlm.g) && "contentType".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 9:
                if ((obj2 instanceof rlm.g) && "contentType".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 10:
                if ((obj2 instanceof rlm.g) && "contentType".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 11:
                if ((obj2 instanceof rlm.g) && "contentType".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 12:
                if ((obj2 instanceof rlm.g) && "contentType".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 13:
                if ((obj2 instanceof rlm.g) && "contentType".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 14:
                if ((obj2 instanceof rlm.g) && "contentType".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 15:
                if ((obj2 instanceof rlm.g) && "type".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 16:
                if ((obj2 instanceof rlm.g) && "status".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 17:
                if ((obj2 instanceof rlm.g) && "contentType".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 18:
                if ((obj2 instanceof rlm.g) && "contentType".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 19:
                if ((obj2 instanceof rlm.g) && "contentType".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 20:
                if ((obj2 instanceof rlm.g) && "type".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 21:
                if ((obj2 instanceof rlm.g) && "type".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 22:
                if ((obj2 instanceof rlm.g) && "type".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 23:
                if ((obj2 instanceof rlm.g) && "type".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 24:
                if ((obj2 instanceof rlm.g) && "type".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 25:
                if ((obj2 instanceof rlm.g) && "code".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 26:
                if ((obj2 instanceof rlm.g) && "type".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 27:
                if ((obj2 instanceof rlm.g) && "type".equals(((rlm.g) obj2).discriminator())) {
                }
                break;
            case 28:
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
        switch (this.f152546a) {
        }
        return 705071198;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        switch (this.f152546a) {
        }
        return "@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=type)";
    }

    public /* synthetic */ g(int i, boolean z) {
        this.f152546a = i;
    }
}
