package xf;

import com.google.protobuf.a1;
import com.google.protobuf.b1;

/* JADX INFO: loaded from: classes17.dex */
public enum d0 implements a1 {
    HTTP_METHOD_UNKNOWN(0),
    GET(1),
    PUT(2),
    POST(3),
    DELETE(4),
    HEAD(5),
    PATCH(6),
    OPTIONS(7),
    TRACE(8),
    CONNECT(9);

    public static final int CONNECT_VALUE = 9;
    public static final int DELETE_VALUE = 4;
    public static final int GET_VALUE = 1;
    public static final int HEAD_VALUE = 5;
    public static final int HTTP_METHOD_UNKNOWN_VALUE = 0;
    public static final int OPTIONS_VALUE = 7;
    public static final int PATCH_VALUE = 6;
    public static final int POST_VALUE = 3;
    public static final int PUT_VALUE = 2;
    public static final int TRACE_VALUE = 8;
    private static final b1 internalValueMap = new b0(0);
    private final int value;

    d0(int i) {
        this.value = i;
    }

    public static d0 a(int i) {
        switch (i) {
            case 0:
                return HTTP_METHOD_UNKNOWN;
            case 1:
                return GET;
            case 2:
                return PUT;
            case 3:
                return POST;
            case 4:
                return DELETE;
            case 5:
                return HEAD;
            case 6:
                return PATCH;
            case 7:
                return OPTIONS;
            case 8:
                return TRACE;
            case 9:
                return CONNECT;
            default:
                return null;
        }
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        return this.value;
    }
}
