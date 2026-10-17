package org.bouncycastle.util.test;

import com.google.android.gms.internal.mlkit_vision_face.a;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes14.dex */
public class SimpleTestResult implements TestResult {
    private static final String SEPARATOR = Strings.lineSeparator();
    private Throwable exception;
    private String message;
    private boolean success;

    public SimpleTestResult(boolean z, String str) {
        this.success = z;
        this.message = str;
    }

    public static TestResult failed(Test test, String str) {
        return new SimpleTestResult(false, test.getName() + ": " + str);
    }

    public static String failedMessage(String str, String str2, String str3, String str4) {
        StringBuilder sbX = a.x(str, " failing ", str2);
        String str5 = SEPARATOR;
        j6.a.D(sbX, str5, "    expected: ", str3, str5);
        return v0.a.i(sbX, "    got     : ", str4);
    }

    public static TestResult successful(Test test, String str) {
        return new SimpleTestResult(true, test.getName() + ": " + str);
    }

    @Override // org.bouncycastle.util.test.TestResult
    public Throwable getException() {
        return this.exception;
    }

    @Override // org.bouncycastle.util.test.TestResult
    public boolean isSuccessful() {
        return this.success;
    }

    @Override // org.bouncycastle.util.test.TestResult
    public String toString() {
        return this.message;
    }

    public SimpleTestResult(boolean z, String str, Throwable th10) {
        this.success = z;
        this.message = str;
        this.exception = th10;
    }

    public static TestResult failed(Test test, String str, Object obj2, Object obj3) {
        StringBuilder sbS = p.a.s(str);
        String str2 = SEPARATOR;
        sbS.append(str2);
        sbS.append("Expected: ");
        sbS.append(obj2);
        sbS.append(str2);
        sbS.append("Found   : ");
        sbS.append(obj3);
        return failed(test, sbS.toString());
    }

    public static TestResult failed(Test test, String str, Throwable th10) {
        return new SimpleTestResult(false, test.getName() + ": " + str, th10);
    }
}
