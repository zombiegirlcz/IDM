package com.fourthline.orca.internal;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.geometry.Offset;
import com.fourthline.orca.internal.ri0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class wr1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FocusManager f34778b;

    public /* synthetic */ wr1(FocusManager focusManager, int i) {
        this.f34777a = i;
        this.f34778b = focusManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f34777a) {
            case 0:
                return ri0.a.a(this.f34778b, (Offset) obj2);
            case 1:
                return c91.a(this.f34778b, (KeyboardActionScope) obj2);
            case 2:
                return i0.a(this.f34778b, (KeyboardActionScope) obj2);
            case 3:
                return i0.b(this.f34778b, (KeyboardActionScope) obj2);
            case 4:
                return i0.c(this.f34778b, (KeyboardActionScope) obj2);
            case 5:
                return i0.d(this.f34778b, (KeyboardActionScope) obj2);
            case 6:
                return i0.e(this.f34778b, (KeyboardActionScope) obj2);
            case 7:
                return ni.a(this.f34778b, (KeyboardActionScope) obj2);
            case 8:
                return ni.b(this.f34778b, (KeyboardActionScope) obj2);
            case 9:
                return ni.c(this.f34778b, (KeyboardActionScope) obj2);
            case 10:
                return s3.a(this.f34778b, (KeyboardActionScope) obj2);
            case 11:
                return vl0.b(this.f34778b, (KeyboardActionScope) obj2);
            case 12:
                return vl0.c(this.f34778b, (KeyboardActionScope) obj2);
            case 13:
                return vl0.a(this.f34778b, (KeyboardActionScope) obj2);
            default:
                return wc0.a(this.f34778b, (KeyboardActionScope) obj2);
        }
    }
}
