package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.i11;
import com.fourthline.orca.internal.m80;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class l11 implements j20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f30505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l70 f30506c;
    private final v10 d;

    public l11(int i, int i2, l70 lottieServiceLocator, v10 imageServiceLocator) {
        Intrinsics.checkNotNullParameter(lottieServiceLocator, "lottieServiceLocator");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        this.f30504a = i;
        this.f30505b = i2;
        this.f30506c = lottieServiceLocator;
        this.d = imageServiceLocator;
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public i11 getInitialState() {
        c81.a aVar = c81.f27404a;
        return new i11(c81.a.a(aVar, this.f30504a, 0, 2, null), c81.a.a(aVar, this.f30505b, 0, 2, null), c81.a.a(aVar, R.string.step_selfie_intro_message, 0, 2, null), zhm.v.k(new i11.a(c81.a.a(aVar, R.string.step_selfie_intro_message_light, 0, 2, null), this.d.a(r10.I0)), new i11.a(c81.a.a(aVar, R.string.step_selfie_intro_message_face, 0, 2, null), this.d.a(r10.H0)), new i11.a(c81.a.a(aVar, R.string.step_selfie_intro_message_eyes, 0, 2, null), this.d.a(r10.G0))), this.f30506c.a(k70.f30157l), new m80.b(null, 1, null), new m80.a.b(null, 1, null));
    }

    public /* synthetic */ l11(int i, int i2, l70 l70Var, v10 v10Var, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? R.string.step_selfie_capture_header_selfie : i, (i3 & 2) != 0 ? R.string.step_selfie_intro_title : i2, l70Var, v10Var);
    }
}
