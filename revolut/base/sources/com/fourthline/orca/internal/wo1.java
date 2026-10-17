package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import com.fourthline.orca.internal.gb1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class wo1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p41 f34759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gb1.d f34760c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ z10 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f34761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f34762h;
    public final /* synthetic */ int i;

    public /* synthetic */ wo1(p41 p41Var, gb1.d dVar, String str, String str2, z10 z10Var, boolean z, int i, int i2, int i3) {
        this.f34758a = i3;
        this.f34759b = p41Var;
        this.f34760c = dVar;
        this.d = str;
        this.e = str2;
        this.f = z10Var;
        this.f34761g = z;
        this.f34762h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f34758a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return kb1.a(this.f34759b, this.f34760c, this.d, this.e, this.f, this.f34761g, this.f34762h, this.i, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return kb1.b(this.f34759b, this.f34760c, this.d, this.e, this.f, this.f34761g, this.f34762h, this.i, (Composer) obj2, iIntValue2);
        }
    }
}
