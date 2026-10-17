package mv0;

import android.opengl.GLES20;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b extends q implements Function2 {
    public static final b f = new b();

    public b() {
        super(2, GLES20.class, "glGetAttribLocation", "glGetAttribLocation(ILjava/lang/String;)I", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return Integer.valueOf(GLES20.glGetAttribLocation(((Number) obj2).intValue(), (String) obj3));
    }
}
