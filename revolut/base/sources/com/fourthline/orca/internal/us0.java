package com.fourthline.orca.internal;

import com.fourthline.orca.qes.internal.error.QesErrorPopupClicksHandler;

/* JADX INFO: loaded from: classes23.dex */
public final class us0 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ms0 f34173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e4m.e f34174b;

    private us0(ms0 ms0Var, e4m.e eVar) {
        this.f34173a = ms0Var;
        this.f34174b = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public QesErrorPopupClicksHandler get() {
        return a(this.f34173a, (fh0) this.f34174b.get());
    }

    public static us0 a(ms0 ms0Var, e4m.e eVar) {
        return new us0(ms0Var, eVar);
    }

    public static QesErrorPopupClicksHandler a(ms0 ms0Var, fh0 fh0Var) {
        QesErrorPopupClicksHandler qesErrorPopupClicksHandlerA = ms0Var.a(fh0Var);
        vc.s.k(qesErrorPopupClicksHandlerA);
        return qesErrorPopupClicksHandlerA;
    }
}
