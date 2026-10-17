package qu9;

import ang.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cl3.a f249275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f249276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f249277c;

    public a(cl3.a contactsInteractor, f userInteractor, c dialogMapper) {
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        this.f249275a = contactsInteractor;
        this.f249276b = userInteractor;
        this.f249277c = dialogMapper;
    }
}
