package com.revolut.analytics.ads.model;

import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import zn.d;

/* JADX INFO: loaded from: classes17.dex */
public interface a extends d {
    String J0();

    String N0();

    Integer R0();

    @Override // zn.d
    default String getIdentifier() {
        return com.google.android.gms.internal.mlkit_vision_face.a.o(N0(), J0(), o0());
    }

    Integer getPosition();

    String n1();

    String o0();

    @Override // zn.d
    default ViewableRecordItem$Type p0() {
        String strJ0 = J0();
        String strN0 = N0();
        String strO0 = o0();
        return new ViewableRecordItem$Type.Impression(R0(), getPosition(), strJ0, strN0, strO0, n1());
    }
}
