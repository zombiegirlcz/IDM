package lim;

import java.io.File;
import kotlin.io.AccessDeniedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class f extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f195565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File[] f195566c;
    public int d;
    public final /* synthetic */ h e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        this.e = hVar;
    }

    @Override // lim.i
    public final File a() {
        Function2 function2;
        j jVar = this.e.d;
        boolean z = this.f195565b;
        File file = this.f195569a;
        if (z) {
            File[] fileArr = this.f195566c;
            if (fileArr == null || this.d < fileArr.length) {
                if (fileArr == null) {
                    File[] fileArrListFiles = file.listFiles();
                    this.f195566c = fileArrListFiles;
                    if (fileArrListFiles == null && (function2 = jVar.e) != null) {
                        function2.invoke(file, new AccessDeniedException(this.f195569a, null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.f195566c;
                    if (fileArr2 == null || fileArr2.length == 0) {
                        Function1 function1 = jVar.d;
                        if (function1 != null) {
                            function1.invoke(file);
                        }
                    }
                }
                File[] fileArr3 = this.f195566c;
                Intrinsics.h(fileArr3);
                int i = this.d;
                this.d = i + 1;
                return fileArr3[i];
            }
            Function1 function12 = jVar.d;
            if (function12 != null) {
                function12.invoke(file);
                return null;
            }
        } else {
            Function1 function13 = jVar.f195572c;
            if (function13 == null || ((Boolean) function13.invoke(file)).booleanValue()) {
                this.f195565b = true;
                return file;
            }
        }
        return null;
    }
}
