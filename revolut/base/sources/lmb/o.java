package lmb;

import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f196932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f196933c;

    public /* synthetic */ o(Ref$ObjectRef ref$ObjectRef, Function0 function0, int i) {
        this.f196931a = i;
        this.f196932b = ref$ObjectRef;
        this.f196933c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f196931a) {
            case 0:
                if (this.f196932b.f186409a == null) {
                    this.f196933c.invoke();
                }
                return Unit.f186387a;
            default:
                return AndroidTextContextMenuToolbarProvider.observeReadsAndGet$lambda$0(this.f196932b, this.f196933c);
        }
    }
}
