package com.fourthline.orca.internal;

import com.google.common.base.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class qg implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eg f32423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f32424b;

    private qg(eg egVar, e4m.e eVar) {
        this.f32423a = egVar;
        this.f32424b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List get() {
        return a(this.f32423a, (Optional) this.f32424b.get());
    }

    public static qg a(eg egVar, e4m.e eVar) {
        return new qg(egVar, eVar);
    }

    public static List a(eg egVar, Optional optional) {
        List listB = egVar.b(optional);
        vc.s.k(listB);
        return listB;
    }
}
