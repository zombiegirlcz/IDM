package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.tooling.PreviewActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class gn1 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28943c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ gn1(Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f28941a = i;
        this.f28942b = obj2;
        this.f28943c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.f28941a) {
            case 0:
                return hi0.a((zp0) this.f28942b, (Function2) this.f28943c, (Function2) this.d, (Function2) this.e, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 1:
                return k31.a((c81) this.f28942b, (p70) this.f28943c, (a9) this.d, (Function0) this.e, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            case 2:
                return vv0.a((String) this.f28942b, (Function1) this.f28943c, (z10) this.d, (z10) this.e, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            default:
                return PreviewActivity.setParameterizedContent$lambda$0$2((String) this.f28942b, (String) this.f28943c, (Object[]) this.d, (MutableIntState) this.e, (PaddingValues) obj2, (Composer) obj3, ((Integer) obj4).intValue());
        }
    }
}
