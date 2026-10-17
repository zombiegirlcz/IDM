package lj1;

import akg.n;
import e7l.g;
import ik3.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lb0.b0;
import rd0.e;
import rh1.b;
import vkm.v1;
import w4l.h;
import zi1.d;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f195589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f195590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n8b.a f195591c;
    public final zi1.a d;

    public a(fk3.a configurationInteractor, d addressInteractor, n8b.a countryInteractor, zi1.a addressFieldSuggestionInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(addressInteractor, "addressInteractor");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(addressFieldSuggestionInteractor, "addressFieldSuggestionInteractor");
        this.f195589a = configurationInteractor;
        this.f195590b = addressInteractor;
        this.f195591c = countryInteractor;
        this.d = addressFieldSuggestionInteractor;
    }

    public final n a() {
        return nim.a.v(e.b(((c) this.f195589a).l(g.a.f123406a, h.f294642c)), new laj.b(this, 27));
    }

    public final String b(String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return ((o8b.c) this.f195591c).b(countryCode);
    }

    public final v1 c(String countryCode) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new v1(new b0(this, countryCode, (Continuation) null, 15));
    }
}
