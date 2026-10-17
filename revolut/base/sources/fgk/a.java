package fgk;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import hha.d;
import hha.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public interface a {
    static AnimatedBackgroundType a(a aVar, d plan) {
        yik.b bVar = (yik.b) aVar;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(AnimatedBackgroundType.DEFAULT.f51471a, "default");
        return bVar.b(s.f(plan));
    }
}
