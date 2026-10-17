package c8;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public interface f {
    ImageHeaderParser$ImageType a(InputStream inputStream);

    ImageHeaderParser$ImageType b(ByteBuffer byteBuffer);

    int c(ByteBuffer byteBuffer, f8.f fVar);

    int d(InputStream inputStream, f8.f fVar);
}
