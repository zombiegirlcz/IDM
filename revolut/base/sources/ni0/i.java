package ni0;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class i implements OnFailureListener, OnCanceledListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ufm.a f215615a;

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        od0.i.Companion.getClass();
        this.f215615a.b(od0.i.f224256b);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f215615a.a(e);
    }
}
