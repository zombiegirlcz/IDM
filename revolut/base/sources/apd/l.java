package apd;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zod.o0;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f8176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f8177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8178c;

    public l(List list, int i, List list2) {
        this.f8176a = list;
        this.f8177b = list2;
        this.f8178c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Image it8 = (Image) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        return new o0(it8, this.f8176a.size(), this.f8177b.size(), this.f8178c);
    }
}
