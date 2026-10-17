package androidx.window.layout;

import androidx.core.util.Consumer;
import androidx.window.layout.WindowInfoTrackerImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WindowInfoTrackerImpl f7709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Consumer f7710c;

    public /* synthetic */ b(WindowInfoTrackerImpl windowInfoTrackerImpl, Consumer consumer, int i) {
        this.f7708a = i;
        this.f7709b = windowInfoTrackerImpl;
        this.f7710c = consumer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f7708a) {
            case 0:
                return WindowInfoTrackerImpl.AnonymousClass1.invokeSuspend$lambda$1(this.f7709b, (a) this.f7710c);
            default:
                return WindowInfoTrackerImpl.AnonymousClass2.invokeSuspend$lambda$1(this.f7709b, (a) this.f7710c);
        }
    }
}
