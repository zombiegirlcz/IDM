package androidx.glance.layout;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class RowKt$Row$1 extends q implements Function0<EmittableRow> {
    public static final RowKt$Row$1 INSTANCE = new RowKt$Row$1();

    public RowKt$Row$1() {
        super(0, EmittableRow.class, "<init>", "<init>()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final EmittableRow invoke() {
        return new EmittableRow();
    }
}
