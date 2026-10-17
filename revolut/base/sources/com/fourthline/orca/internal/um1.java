package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.fourthline.orca.internal.c21;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class um1 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34133c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ um1(Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f34131a = i;
        this.d = obj2;
        this.e = obj3;
        this.f34132b = obj4;
        this.f34133c = obj5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f34131a) {
            case 0:
                return h21.a((c21.b) this.d, (Function0) this.e, (Function1) this.f34132b, (Function1) this.f34133c, (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                return hi0.a((zp0) this.d, (Function2) this.e, (Function1) this.f34132b, (Function1) this.f34133c, (Composer) obj2, ((Integer) obj3).intValue());
            case 2:
                return pr0.a((MutableState) this.d, (String) this.e, (Function1) this.f34132b, (MutableState) this.f34133c, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return si0.a((Modifier) this.d, (wz0) this.e, (Alignment.Horizontal) this.f34132b, (Function3) this.f34133c, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }
}
