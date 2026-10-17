package dok;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yik.b f116581a;

    public e(yik.b animatedBackgroundTypeMapper) {
        Intrinsics.checkNotNullParameter(animatedBackgroundTypeMapper, "animatedBackgroundTypeMapper");
        this.f116581a = animatedBackgroundTypeMapper;
    }

    public final AnimatedBackgroundType a(String str) {
        return (str == null || d0.W(str)) ? AnimatedBackgroundType.DEFAULT.f51471a : this.f116581a.c(str);
    }
}
