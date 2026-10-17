package com.fourthline.orca.core.internal.activity;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.State;
import androidx.compose.ui.tooling.PreviewActivity;
import com.fourthline.orca.internal.bj0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f26651c;

    public /* synthetic */ a(bj0 bj0Var, OrcaActivity orcaActivity) {
        this.f26649a = 1;
        this.f26650b = bj0Var;
        this.f26651c = orcaActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f26649a) {
            case 0:
                return OrcaActivity.a((State) this.f26651c, (bj0) this.f26650b, (Composer) obj2, ((Integer) obj3).intValue());
            case 1:
                return OrcaActivity.a((bj0) this.f26650b, (OrcaActivity) this.f26651c, (Composer) obj2, ((Integer) obj3).intValue());
            case 2:
                return PreviewActivity.setComposableContent$lambda$1((String) this.f26651c, (String) this.f26650b, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return PreviewActivity.setParameterizedContent$lambda$0$1((Object[]) this.f26651c, (MutableIntState) this.f26650b, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f26649a = i;
        this.f26651c = obj2;
        this.f26650b = obj3;
    }
}
