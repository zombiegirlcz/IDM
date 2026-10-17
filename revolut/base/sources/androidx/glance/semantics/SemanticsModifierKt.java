package androidx.glance.semantics;

import androidx.glance.GlanceModifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/glance/GlanceModifier;", "Lkotlin/Function1;", "Landroidx/glance/semantics/SemanticsPropertyReceiver;", "", "properties", "semantics", "(Landroidx/glance/GlanceModifier;Lkotlin/jvm/functions/Function1;)Landroidx/glance/GlanceModifier;", "glance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public abstract class SemanticsModifierKt {
    @NotNull
    public static final GlanceModifier semantics(@NotNull GlanceModifier glanceModifier, @NotNull Function1<? super SemanticsPropertyReceiver, Unit> function1) {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        function1.invoke(semanticsConfiguration);
        return glanceModifier.then(new SemanticsModifier(semanticsConfiguration));
    }
}
