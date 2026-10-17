package rlk;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.iq;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements b {

    /* JADX INFO: renamed from: rlk.a$a, reason: collision with other inner class name */
    public static final class C1408a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f255091a = new ArrayList();

        public static InputChecklistDelegate.Model a(TextLocalisedClause title, String reasonId, boolean z) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(reasonId, "reasonId");
            InputChecklistDelegate.Model model = new InputChecklistDelegate.Model(reasonId, title, z, false, new InputChecklistDelegate.a.b(null), iq.RADIO_BUTTON, null, null, null, null, 0, 0, 0, 524232);
            yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
            return model;
        }
    }
}
