package kji;

import android.content.Context;
import java.util.Set;
import jo0.h;
import kotlin.jvm.internal.Intrinsics;
import oim.n;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class h implements n {
    @Override // oim.n
    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
        mki.b environment = (mki.b) obj2;
        Context originalContext = (Context) obj3;
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(originalContext, "originalContext");
        jo0.h.Companion.getClass();
        return i.a(environment, originalContext, (Integer) obj4, (Set) obj5, h.a.a().c());
    }
}
