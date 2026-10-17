package z1;

import androidx.compose.runtime.ComposerImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f318698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComposerImpl f318699b;

    public /* synthetic */ a(ComposerImpl composerImpl, int i) {
        this.f318698a = i;
        this.f318699b = composerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f318698a) {
        }
        return this.f318699b.currentStackTrace();
    }
}
