package com.fourthline.orca.internal;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import com.fourthline.orca.internal.c21;
import java.util.List;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class pi1 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31973a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f31974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31975c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Function e;
    public final /* synthetic */ Object f;

    public /* synthetic */ pi1(c21.b bVar, MutableState mutableState, Function0 function0, Function1 function1, Function1 function12) {
        this.f31975c = bVar;
        this.d = mutableState;
        this.f31974b = function0;
        this.e = function1;
        this.f = function12;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.f31973a) {
            case 0:
                int iIntValue = ((Integer) obj4).intValue();
                return a40.a((List) this.f31975c, this.f31974b, (Function3) this.d, (Function2) this.e, (z10) this.f, (ColumnScope) obj2, (Composer) obj3, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj4).intValue();
                return h21.a((c21.b) this.f31975c, (MutableState) this.d, this.f31974b, (Function1) this.e, (Function1) this.f, (AnimatedVisibilityScope) obj2, (Composer) obj3, iIntValue2);
        }
    }

    public /* synthetic */ pi1(List list, Function0 function0, Function3 function3, Function2 function2, z10 z10Var) {
        this.f31975c = list;
        this.f31974b = function0;
        this.d = function3;
        this.e = function2;
        this.f = z10Var;
    }
}
