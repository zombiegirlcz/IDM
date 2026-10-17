package com.fourthline.orca.internal;

import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.fourthline.orca.internal.ff0;
import kotlin.Function;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class tn1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33810a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f33811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f33812c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f33813g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function f33814h;

    public /* synthetic */ tn1(Modifier modifier, ff0.a.InterfaceC0196a interfaceC0196a, Pair pair, boolean z, Function0 function0, int i, int i2) {
        this.f33811b = modifier;
        this.f = interfaceC0196a;
        this.f33813g = pair;
        this.f33812c = z;
        this.f33814h = function0;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f33810a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return ii0.a(this.f33811b, this.f33812c, (SnackbarHostState) this.f, (Function3) this.f33813g, (Function3) this.f33814h, this.d, this.e, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return jf0.a(this.f33811b, (ff0.a.InterfaceC0196a) this.f, (Pair) this.f33813g, this.f33812c, (Function0) this.f33814h, this.d, this.e, (Composer) obj2, iIntValue2);
        }
    }

    public /* synthetic */ tn1(Modifier modifier, boolean z, SnackbarHostState snackbarHostState, Function3 function3, Function3 function32, int i, int i2) {
        this.f33811b = modifier;
        this.f33812c = z;
        this.f = snackbarHostState;
        this.f33813g = function3;
        this.f33814h = function32;
        this.d = i;
        this.e = i2;
    }
}
