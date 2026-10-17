package am2;

import efm.r;
import kotlin.jvm.internal.Intrinsics;
import yjj.j;
import zi0.c;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n8b.a f6285a;

    public a(n8b.a countryInteractor, int i) {
        switch (i) {
            case 2:
                Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
                this.f6285a = countryInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
                this.f6285a = countryInteractor;
                break;
        }
    }

    public r a() {
        return nim.a.w(c.j(Boolean.valueOf(((o8b.c) this.f6285a).g())), new j(29));
    }

    public a(n8b.a countryInteractor, dj3.a chooserScreenCommandsFactory) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(chooserScreenCommandsFactory, "chooserScreenCommandsFactory");
        this.f6285a = countryInteractor;
    }
}
