package rx0;

import android.R;
import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f ANIMATABLE;
    private static final int ANIMATABLE_EXIT_FADE_DURATION_MS = 150;

    @NotNull
    private static final d Companion;
    public static final f DEFAULT;
    private static final int ENTER_FADE_DURATION_MS = 200;
    private static final int EXIT_FADE_DURATION_MS = 200;

    @NotNull
    private static final int[] STATE_ACTIVATED;

    @NotNull
    private static final int[] STATE_CHECKED;

    @NotNull
    private static final int[] STATE_CHECKED_ACTIVATED;

    @NotNull
    private static final int[] STATE_DISABLED;

    @NotNull
    private static final int[] STATE_EMPTY;
    public static final f WIDGET;

    static {
        f fVar = new f("DEFAULT", 0);
        DEFAULT = fVar;
        f fVar2 = new f("WIDGET", 1);
        WIDGET = fVar2;
        f fVar3 = new f("ANIMATABLE", 2);
        ANIMATABLE = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
        Companion = new d();
        STATE_CHECKED_ACTIVATED = new int[]{R.attr.state_checked, R.attr.state_activated};
        STATE_CHECKED = new int[]{R.attr.state_checked};
        STATE_DISABLED = new int[]{-16842910};
        STATE_ACTIVATED = new int[]{R.attr.state_activated};
        STATE_EMPTY = new int[0];
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final StateListDrawable a(Context context, float f) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = e.f258000a[ordinal()];
        if (i == 1) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.setEnterFadeDuration(200);
            stateListDrawable.setExitFadeDuration(200);
            stateListDrawable.addState(STATE_CHECKED_ACTIVATED, dr0.l.h(context, f, new Color.Solid(R$attr.uikit_colorInputErrorFocus), 0, null));
            stateListDrawable.addState(STATE_CHECKED, dr0.l.h(context, f, new Color.Solid(R$attr.uikit_colorInputError), 0, null));
            stateListDrawable.addState(STATE_DISABLED, dr0.l.h(context, f, new Color.Solid(R$attr.uikit_colorSearchBackground), 0, null));
            stateListDrawable.addState(STATE_ACTIVATED, dr0.l.h(context, f, new Color.Solid(R$attr.uikit_colorGreyTone10), 0, null));
            stateListDrawable.addState(STATE_EMPTY, dr0.l.h(context, f, new Color.Solid(R$attr.uikit_colorSearchBackground), 0, null));
            return stateListDrawable;
        }
        if (i != 2) {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            StateListDrawable stateListDrawable2 = new StateListDrawable();
            stateListDrawable2.setExitFadeDuration(150);
            stateListDrawable2.addState(STATE_ACTIVATED, dr0.l.h(context, f, new Color.Solid(R$attr.uikit_colorGreyTone10), 0, null));
            stateListDrawable2.addState(STATE_EMPTY, dr0.l.h(context, f, new Color.Solid(R$attr.uikit_colorSearchBackground), 0, null));
            return stateListDrawable2;
        }
        StateListDrawable stateListDrawable3 = new StateListDrawable();
        stateListDrawable3.setEnterFadeDuration(200);
        stateListDrawable3.setExitFadeDuration(200);
        stateListDrawable3.addState(STATE_CHECKED_ACTIVATED, dr0.l.h(context, f, new Color.Solid(R$attr.uikit_colorInputErrorFocus), 0, null));
        stateListDrawable3.addState(STATE_CHECKED, dr0.l.h(context, f, new Color.Solid(R$attr.uikit_colorInputError), 0, null));
        stateListDrawable3.addState(STATE_DISABLED, dr0.l.h(context, f, new Color.Solid(R$attr.uikit_colorGreyTone5), 0, null));
        stateListDrawable3.addState(STATE_ACTIVATED, dr0.l.h(context, f, new Color.Solid(R$attr.uikit_colorGreyTone10), 0, null));
        stateListDrawable3.addState(STATE_EMPTY, dr0.l.h(context, f, new Color.Solid(R$attr.uikit_colorWidgetBackground), 0, null));
        return stateListDrawable3;
    }
}
