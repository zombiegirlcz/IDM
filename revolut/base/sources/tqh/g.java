package tqh;

import com.revolut.core.ui_kit.delegates.ChatItemsDelegate;
import com.revolut.core.ui_kit.delegates.l3;
import gw0.t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final gw0.i f273582c = new gw0.i(t.SINGLE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uqh.f f273583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uqh.d f273584b;

    public g(uqh.f contentMapper, uqh.d errorContentMapper) {
        Intrinsics.checkNotNullParameter(contentMapper, "contentMapper");
        Intrinsics.checkNotNullParameter(errorContentMapper, "errorContentMapper");
        this.f273583a = contentMapper;
        this.f273584b = errorContentMapper;
    }

    public static ChatItemsDelegate.Model a(String str) {
        return new ChatItemsDelegate.Model(new l3(3), str, f273582c, null, gw0.l.LARGE, null, null, 131048);
    }
}
