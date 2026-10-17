package androidx.compose.ui.platform;

import androidx.compose.ui.res.ResourceIdCache;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/res/ResourceIdCache;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class AndroidCompositionLocals_androidKt$LocalResourceIdCache$1 extends u implements Function0<ResourceIdCache> {
    public static final AndroidCompositionLocals_androidKt$LocalResourceIdCache$1 INSTANCE = new AndroidCompositionLocals_androidKt$LocalResourceIdCache$1();

    public AndroidCompositionLocals_androidKt$LocalResourceIdCache$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ResourceIdCache invoke() {
        AndroidCompositionLocals_androidKt.noLocalProvidedFor("LocalResourceIdCache");
        throw new KotlinNothingValueException();
    }
}
