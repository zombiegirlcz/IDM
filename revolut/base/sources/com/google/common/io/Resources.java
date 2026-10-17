package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
public final class Resources {

    public static final class UrlByteSource extends ByteSource {

        /* JADX INFO: renamed from: url, reason: collision with root package name */
        private final URL f49286url;

        @Override // com.google.common.io.ByteSource
        public InputStream openStream() throws IOException {
            return this.f49286url.openStream();
        }

        public String toString() {
            return "Resources.asByteSource(" + this.f49286url + ")";
        }

        private UrlByteSource(URL url2) {
            this.f49286url = (URL) Preconditions.checkNotNull(url2);
        }
    }

    private Resources() {
    }

    public static ByteSource asByteSource(URL url2) {
        return new UrlByteSource(url2);
    }

    public static CharSource asCharSource(URL url2, Charset charset) {
        return asByteSource(url2).asCharSource(charset);
    }

    public static void copy(URL url2, OutputStream outputStream) throws Throwable {
        asByteSource(url2).copyTo(outputStream);
    }

    public static URL getResource(String str) {
        URL resource = ((ClassLoader) MoreObjects.firstNonNull(Thread.currentThread().getContextClassLoader(), Resources.class.getClassLoader())).getResource(str);
        Preconditions.checkArgument(resource != null, "resource %s not found.", str);
        return resource;
    }

    @ParametricNullness
    public static <T> T readLines(URL url2, Charset charset, LineProcessor<T> lineProcessor) throws IOException {
        return (T) asCharSource(url2, charset).readLines(lineProcessor);
    }

    public static byte[] toByteArray(URL url2) throws IOException {
        return asByteSource(url2).read();
    }

    public static String toString(URL url2, Charset charset) throws IOException {
        return asCharSource(url2, charset).read();
    }

    public static List<String> readLines(URL url2, Charset charset) throws IOException {
        return (List) readLines(url2, charset, new LineProcessor<List<String>>() { // from class: com.google.common.io.Resources.1
            final List<String> result = Lists.newArrayList();

            @Override // com.google.common.io.LineProcessor
            public boolean processLine(String str) {
                this.result.add(str);
                return true;
            }

            @Override // com.google.common.io.LineProcessor
            public List<String> getResult() {
                return this.result;
            }
        });
    }

    public static URL getResource(Class<?> cls, String str) {
        URL resource = cls.getResource(str);
        Preconditions.checkArgument(resource != null, "resource %s relative to %s not found.", str, cls.getName());
        return resource;
    }
}
