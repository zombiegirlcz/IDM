package androidx.glance.appwidget;

import androidx.glance.GlanceModifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0018\u0010\u0002\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/glance/GlanceModifier;", "", "isSelectableGroup", "(Landroidx/glance/GlanceModifier;)Z", "glance-appwidget_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class RadioButtonKt {

    /* JADX INFO: renamed from: androidx.glance.appwidget.RadioButtonKt$isSelectableGroup$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/glance/GlanceModifier$Element;", "invoke", "(Landroidx/glance/GlanceModifier$Element;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends u implements Function1<GlanceModifier.Element, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull GlanceModifier.Element element) {
            return false;
        }
    }

    public static final boolean isSelectableGroup(@NotNull GlanceModifier glanceModifier) {
        return glanceModifier.any(AnonymousClass1.INSTANCE);
    }
}
