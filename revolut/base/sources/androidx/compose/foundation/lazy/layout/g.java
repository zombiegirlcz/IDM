package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazySaveableStateHolder;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class g implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return LazySaveableStateHolder.Companion.saver$lambda$0((SaverScope) obj2, (LazySaveableStateHolder) obj3);
    }
}
