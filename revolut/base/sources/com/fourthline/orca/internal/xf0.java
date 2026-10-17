package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.hd0;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class xf0 implements gq0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v10 f34974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final id0 f34975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c81 f34976c;
    private final c81 d;
    private final hd0.e e;

    public xf0(v10 imageServiceLocator, id0 skippableProvider, c81 descriptionResource, c81 actionResource) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(skippableProvider, "skippableProvider");
        Intrinsics.checkNotNullParameter(descriptionResource, "descriptionResource");
        Intrinsics.checkNotNullParameter(actionResource, "actionResource");
        this.f34974a = imageServiceLocator;
        this.f34975b = skippableProvider;
        this.f34976c = descriptionResource;
        this.d = actionResource;
        this.e = new hd0.e(null);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public /* bridge */ void a(hq0.c cVar) {
        super.a(cVar);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public hd0.e b() {
        return this.e;
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return new zp0.e(this.f34974a.a(r10.D0), this.f34976c, new kd1.j(this.d), this.f34975b.a(b()) ? new kd1.n(c81.a.a(c81.f27404a, R.string.shared_button_skip_nfc, 0, 2, null)) : null, true);
    }

    @Override // com.fourthline.orca.internal.gq0.a
    public /* bridge */ void b(hq0.c cVar) {
        super.b(cVar);
    }

    public /* synthetic */ xf0(v10 v10Var, id0 id0Var, c81 c81Var, c81 c81Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(v10Var, id0Var, (i & 4) != 0 ? c81.a.a(c81.f27404a, R.string.shared_dialog_error_nfc_failed_title, 0, 2, null) : c81Var, (i & 8) != 0 ? c81.a.a(c81.f27404a, R.string.shared_button_update_details, 0, 2, null) : c81Var2);
    }
}
