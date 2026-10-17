package lz7;

import com.google.firebase.messaging.t;
import fx7.m;
import kotlin.jvm.internal.Intrinsics;
import lu5.o;
import org.jetbrains.annotations.NotNull;
import tm.g;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements mm.b {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f200949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g3l.a f200950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f200951c;

    public f(t actionDelegateFactory, m petReminderInteractor, g3l.a statusDialogViewConfigurationDispatcher) {
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        Intrinsics.checkNotNullParameter(petReminderInteractor, "petReminderInteractor");
        Intrinsics.checkNotNullParameter(statusDialogViewConfigurationDispatcher, "statusDialogViewConfigurationDispatcher");
        this.f200949a = petReminderInteractor;
        this.f200950b = statusDialogViewConfigurationDispatcher;
        this.f200951c = actionDelegateFactory.f(new o(this, 22));
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        c action = (c) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return this.f200951c.a(action);
    }
}
