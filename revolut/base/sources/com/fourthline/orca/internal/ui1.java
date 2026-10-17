package com.fourthline.orca.internal;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ui1 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34108a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f34109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f34110c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ui1(k41 k41Var, kd1 kd1Var, String str, boolean z) {
        this.f34109b = z;
        this.d = k41Var;
        this.e = kd1Var;
        this.f34110c = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.f34108a) {
            case 0:
                int iIntValue = ((Integer) obj4).intValue();
                return a80.a(this.f34109b, this.f34110c, (Role) this.d, (Function0) this.e, (Modifier) obj2, (Composer) obj3, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj4).intValue();
                return p9.a(this.f34109b, (k41) this.d, (kd1) this.e, this.f34110c, (RowScope) obj2, (Composer) obj3, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj4).intValue();
                return ri0.a(this.f34110c, (Alignment.Horizontal) this.d, this.f34109b, (n80) this.e, (ColumnScope) obj2, (Composer) obj3, iIntValue3);
        }
    }

    public /* synthetic */ ui1(String str, Alignment.Horizontal horizontal, boolean z, n80 n80Var) {
        this.f34110c = str;
        this.d = horizontal;
        this.f34109b = z;
        this.e = n80Var;
    }

    public /* synthetic */ ui1(boolean z, String str, Role role, Function0 function0) {
        this.f34109b = z;
        this.f34110c = str;
        this.d = role;
        this.e = function0;
    }
}
