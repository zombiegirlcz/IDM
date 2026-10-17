package bx5;

import b88.o;
import bt9.t;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements p {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.c f19491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l2i.b f19492b;

    public i(cx5.a suggestionsMapper, f01.c uiKitResources, l2i.b currencyPickerDataMapper) {
        Intrinsics.checkNotNullParameter(suggestionsMapper, "suggestionsMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(currencyPickerDataMapper, "currencyPickerDataMapper");
        this.f19491a = uiKitResources;
        this.f19492b = currencyPickerDataMapper;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        zw5.a domainState = (zw5.a) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f325727g, new t(this, 22), new bw4.t(8), new b1c.p(this, domainState, 23));
        Data data = domainState.f325727g;
        String str = (String) iii.c.f(data, new t(23), new bw4.t(9), new b0c.a(17));
        Image image = (Image) iii.c.f(data, new t(24), new bw4.t(10), new o(this, 22));
        dj0.d dVar = domainState.f325724a;
        return new zw5.g(str, image, !dVar.k() && dVar.compareTo(domainState.f325725b) <= 0 && dVar.compareTo(domainState.f325726c.f95269h) >= 0, domainState.f325728h, list);
    }
}
