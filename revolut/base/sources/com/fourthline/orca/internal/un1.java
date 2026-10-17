package com.fourthline.orca.internal;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class un1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f34136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34137c;

    public /* synthetic */ un1(Object obj2, boolean z, int i) {
        this.f34135a = i;
        this.f34137c = obj2;
        this.f34136b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f34135a) {
            case 0:
                return im.a(this.f34136b, (im) this.f34137c, (fm) obj2);
            case 1:
                return t3.a(this.f34136b, (t3) this.f34137c, (p3) obj2);
            case 2:
                return u50.a((MutableState) this.f34137c, this.f34136b, (TextLayoutResult) obj2);
            case 3:
                return xe.a((xe) this.f34137c, this.f34136b, (li) obj2);
            case 4:
                return yo.a(this.f34136b, (yo) this.f34137c, (lo) obj2);
            default:
                StringBuilder sb6 = (StringBuilder) this.f34137c;
                Byte b4 = (Byte) obj2;
                byte bByteValue = b4.byteValue();
                if (kem.b.f183183a.contains(b4) || kem.b.e.contains(b4)) {
                    sb6.append((char) bByteValue);
                } else if (this.f34136b && bByteValue == 32) {
                    sb6.append('+');
                } else {
                    sb6.append(kem.b.g(bByteValue));
                }
                return Unit.f186387a;
        }
    }

    public /* synthetic */ un1(boolean z, j20 j20Var, int i) {
        this.f34135a = i;
        this.f34136b = z;
        this.f34137c = j20Var;
    }
}
