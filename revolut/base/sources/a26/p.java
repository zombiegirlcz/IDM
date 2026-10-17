package a26;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f687b;

    public /* synthetic */ p(Object obj2, int i) {
        this.f686a = i;
        this.f687b = obj2;
    }

    public eic.e a(dgc.a button) {
        Intrinsics.checkNotNullParameter(button, "button");
        String str = button.f114615c;
        return new eic.e(new TextClause(button.f114613a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), str != null ? new ResourceImage(((f01.a) this.f687b).a(str), (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01a3  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 1442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a26.p.invoke(java.lang.Object):java.lang.Object");
    }

    public p(f01.a uiKitResources) {
        this.f686a = 9;
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f687b = uiKitResources;
    }

    public p() {
        this.f686a = 27;
        this.f687b = new AtomicBoolean(true);
    }
}
