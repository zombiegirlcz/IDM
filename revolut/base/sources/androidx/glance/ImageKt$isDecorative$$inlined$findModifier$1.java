package androidx.glance;

import androidx.glance.GlanceModifier;
import androidx.glance.semantics.SemanticsModifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\u0010\u0001\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "acc", "Landroidx/glance/GlanceModifier$Element;", "cur", "invoke", "(Ljava/lang/Object;Landroidx/glance/GlanceModifier$Element;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class ImageKt$isDecorative$$inlined$findModifier$1 extends u implements Function2<SemanticsModifier, GlanceModifier.Element, SemanticsModifier> {
    public static final ImageKt$isDecorative$$inlined$findModifier$1 INSTANCE = new ImageKt$isDecorative$$inlined$findModifier$1();

    public ImageKt$isDecorative$$inlined$findModifier$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
        return invoke((SemanticsModifier) obj2, (GlanceModifier.Element) obj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SemanticsModifier invoke(SemanticsModifier semanticsModifier, @NotNull GlanceModifier.Element element) {
        return element instanceof SemanticsModifier ? element : semanticsModifier;
    }
}
