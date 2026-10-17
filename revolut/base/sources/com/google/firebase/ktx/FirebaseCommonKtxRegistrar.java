package com.google.firebase.ktx;

import androidx.annotation.Keep;
import ce.a;
import ce.b;
import ce.n;
import ce.t;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import vd.c;
import yhm.d;
import zhm.v;

/* JADX INFO: loaded from: classes17.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lce/b;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@d
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<b> getComponents() {
        a aVarA = b.a(new t(vd.a.class, CoroutineDispatcher.class));
        aVarA.a(new n(new t(vd.a.class, Executor.class), 1, 0));
        aVarA.f = jf.a.f173622b;
        b bVarB = aVarA.b();
        Intrinsics.checkNotNullExpressionValue(bVarB, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        a aVarA2 = b.a(new t(c.class, CoroutineDispatcher.class));
        aVarA2.a(new n(new t(c.class, Executor.class), 1, 0));
        aVarA2.f = jf.a.f173623c;
        b bVarB2 = aVarA2.b();
        Intrinsics.checkNotNullExpressionValue(bVarB2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        a aVarA3 = b.a(new t(vd.b.class, CoroutineDispatcher.class));
        aVarA3.a(new n(new t(vd.b.class, Executor.class), 1, 0));
        aVarA3.f = jf.a.d;
        b bVarB3 = aVarA3.b();
        Intrinsics.checkNotNullExpressionValue(bVarB3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        a aVarA4 = b.a(new t(vd.d.class, CoroutineDispatcher.class));
        aVarA4.a(new n(new t(vd.d.class, Executor.class), 1, 0));
        aVarA4.f = jf.a.e;
        b bVarB4 = aVarA4.b();
        Intrinsics.checkNotNullExpressionValue(bVarB4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return v.k(bVarB, bVarB2, bVarB3, bVarB4);
    }
}
