package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.gq0;
import com.fourthline.orca.internal.kd1;
import com.fourthline.orca.internal.ke0;
import com.fourthline.orca.internal.zp0;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class re0 implements gq0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v10 f32700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final qg0 f32701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function0 f32702c;
    private final hq0 d;
    private final Lazy e;

    public re0(v10 imageServiceLocator, qg0 analytics, Function0 isPassportUseCase) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(isPassportUseCase, "isPassportUseCase");
        this.f32700a = imageServiceLocator;
        this.f32701b = analytics;
        this.f32702c = isPassportUseCase;
        this.d = ne0.f31400a;
        this.e = yhm.j.b(new ko1(this, 29));
    }

    private final List e() {
        c81.a aVar = c81.f27404a;
        List listK = zhm.v.k(new bi0(c81.a.a(aVar, R.string.shared_dialog_nfc_instruction_android_header_ready, 0, 2, null), c81.a.a(aVar, R.string.shared_dialog_nfc_instruction_android_message_ready, 0, 2, null), null, this.f32700a.a(((Boolean) this.f32702c.invoke()).booleanValue() ? r10.f : r10.f32578g), 4, null), new bi0(c81.a.a(aVar, R.string.shared_dialog_nfc_instruction_android_header_start, 0, 2, null), c81.a.a(aVar, R.string.shared_dialog_nfc_instruction_android_message_start_center, 0, 2, null), null, this.f32700a.a(((Boolean) this.f32702c.invoke()).booleanValue() ? r10.f32579h : r10.i), 4, null), new bi0(c81.a.a(aVar, R.string.shared_dialog_nfc_instruction_android_header_hold, 0, 2, null), c81.a.a(aVar, R.string.shared_dialog_nfc_instruction_android_message_hold, 0, 2, null), null, this.f32700a.a(((Boolean) this.f32702c.invoke()).booleanValue() ? r10.f32581j : r10.k), 4, null), new bi0(c81.a.a(aVar, R.string.shared_dialog_nfc_instruction_android_header_no_connection, 0, 2, null), c81.a.a(aVar, R.string.shared_dialog_nfc_instruction_android_message_no_connection, 0, 2, null), null, this.f32700a.a(((Boolean) this.f32702c.invoke()).booleanValue() ? r10.f32583l : r10.f32584m), 4, null), new bi0(c81.a.a(aVar, R.string.shared_dialog_nfc_instruction_android_header_complete, 0, 2, null), c81.a.a(aVar, R.string.shared_dialog_nfc_instruction_android_message_complete, 0, 2, null), null, this.f32700a.a(((Boolean) this.f32702c.invoke()).booleanValue() ? r10.f32585n : r10.o), 4, null));
        ArrayList arrayList = new ArrayList(zhm.w.t(listK, 10));
        Iterator it8 = listK.iterator();
        while (it8.hasNext()) {
            arrayList.add(ci0.a((bi0) it8.next(), (Function0) null, 1, (Object) null));
        }
        return arrayList;
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a(int i) {
        super.a(i);
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void d() {
        super.d();
    }

    @Override // com.fourthline.orca.internal.gq0
    public zp0 getState() {
        return (zp0) this.e.getValue();
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public /* bridge */ void a() {
        super.a();
    }

    @Override // com.fourthline.orca.internal.gq0.b
    public hq0 c() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zp0.g a(re0 re0Var) {
        return new zp0.g(re0Var.e(), new ci1(re0Var, 5), false, kd1.l.f30231a, kd1.b.f30209a, re0Var.f32700a.a(r10.M0), false, 68, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(re0 re0Var, int i, int i2) {
        re0Var.f32701b.track(new ke0.a.c("dialog", i, i2));
        return Unit.f186387a;
    }
}
