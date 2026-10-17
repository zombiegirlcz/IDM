package kn3;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f185977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f185978b;

    public b(f contactsChooserSearchInteractor, h contactsChooserSuggestedInteractor, d contactsChooserInteractorUtils) {
        Intrinsics.checkNotNullParameter(contactsChooserSearchInteractor, "contactsChooserSearchInteractor");
        Intrinsics.checkNotNullParameter(contactsChooserSuggestedInteractor, "contactsChooserSuggestedInteractor");
        Intrinsics.checkNotNullParameter(contactsChooserInteractorUtils, "contactsChooserInteractorUtils");
        this.f185977a = contactsChooserSearchInteractor;
        this.f185978b = contactsChooserSuggestedInteractor;
    }
}
