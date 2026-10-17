package ll;

import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentManager f196486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f196487b;

    public a(FragmentManager fragmentManager, b backstackListener) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(backstackListener, "backstackListener");
        this.f196486a = fragmentManager;
        this.f196487b = backstackListener;
    }
}
