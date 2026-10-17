package mv0;

import android.opengl.GLES20;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class d extends q implements Function2 {
    public static final d f = new d();

    public d() {
        super(2, GLES20.class, "glGetUniformLocation", "glGetUniformLocation(ILjava/lang/String;)I", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return Integer.valueOf(GLES20.glGetUniformLocation(((Number) obj2).intValue(), (String) obj3));
    }
}
